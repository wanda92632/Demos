package com.wanda.demos.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/11/10 17:07
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 默认所有可用IP 地址上进行监听
        ServerSocket server = new ServerSocket(2000);

        System.out.println("服务器已经启动，并进入后续流程···");
        System.out.println("服务器信息：" + server.getInetAddress() + "Port：" + server.getLocalPort());

        // 等待客户端连接
        for (; ; ) {
            // 得到客户端
            Socket client = server.accept();
            //客户端构建异步线程
            ClientHandler clientHandler = new ClientHandler(client);
            clientHandler.start();
        }
    }

    /**
     * 客户端消息处理
     */
    private static class ClientHandler extends Thread {
        private Socket socket;
        private boolean flag = true;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            super.run();
            System.out.println("新客户端连接：" + socket.getInetAddress() + " Port：" + socket.getPort());

            try {
                // 得到打印流，用于数据输出，服务器回送数据使用
                PrintStream socketOutPut = new PrintStream(socket.getOutputStream());
                // 得到输入流，用于接收数据
                BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                do {
                    // 客户端拿到一条数据
                    String str = socketInput.readLine();
                    if ("bye".equalsIgnoreCase(str)) {
                        flag = false;
                        // 回送
                        socketOutPut.println("bye");
                    } else {
                        // 打印到屏幕
                        System.out.println(str);
                        socketOutPut.println("回送：" + str.length());
                    }
                } while (flag);
            } catch (Exception e) {
                System.out.println("连接异常断开");
            } finally {
                // 连接关闭
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("客户端已退出：" + socket.getInetAddress() + " Port：" + socket.getPort());
        }
    }
}
