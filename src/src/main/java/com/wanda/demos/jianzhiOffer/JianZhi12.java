package jianzhiOffer;

public class JianZhi12 {
    public static void main(String[] args) {
        //字符矩阵
        char[][] matrix = {
                {'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}
        };
        JianZhi12 jianZhi12 = new JianZhi12();
        String str = "acfdeh";
        if (jianZhi12.hasPath(matrix,matrix.length,matrix[0].length,str)){
            System.out.println("找到");
        }else {
            System.out.println("未找到");
        }
    }

    public  boolean hasPath(char[][] matrix, int rows, int cols, String str) {
        if (matrix.length == 0 || rows < 1 || cols < 1) {
            return false;
        }

        //标记矩阵
        boolean[][] visited = new boolean[rows][cols];

        int pathLength = 0;
        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                if (hasPathCore(matrix, rows, cols, row, col, str.toCharArray(), pathLength, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param matrix 字符矩阵
     * @param rows 行数
     * @param cols 列数
     * @param row 当前字符行坐标
     * @param col 当前字符列坐标
     * @param str 字符串数组
     * @param pathLength 字符串数组已匹配长度
     * @param visited 是否已选取的标记矩阵
     * @return
     */
    public  boolean hasPathCore(final char[][] matrix, int rows, int cols, int row, int col, char[] str, int pathLength, boolean[][] visited) {
        if (str.length == pathLength) {
            return true;
        }
        boolean hasPath = false;
        //判断是否到达边界、对应位置字符是否相等，以及当前字符是否已经选取过
        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row][col] == str[pathLength] && !visited[row][col]) {

            //匹配通过则已匹配数加一
            ++pathLength;

            //对应位置的字符设置为已选取
            visited[row][col] = true;

            //判断下一个位置
            hasPath = hasPathCore(matrix, rows, cols, row, col - 1, str, pathLength, visited)
                    || hasPathCore(matrix, rows, cols, row - 1, col, str, pathLength, visited)
                    || hasPathCore(matrix, rows, cols, row, col + 1, str, pathLength, visited)
                    || hasPathCore(matrix, rows, cols, row + 1, col, str, pathLength, visited);

            //未通过则设置为未选取，匹配长度减一
            if (!hasPath) {
                --pathLength;
                visited[row][col] = false;
            }
        }
        //返回匹配结果
        return hasPath;
    }
}
