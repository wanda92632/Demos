package demos.mybatis;

import org.apache.ibatis.executor.BatchExecutor;
import org.apache.ibatis.executor.ReuseExecutor;
import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ExecutorTest {


    public static final String JDBC_URL = "jdbc:MySQL://127.0.0.1:3306/blog?useUnicode=true&characterEncoding=UTF-8";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "MEIgui571254933.";

    // Mybatis配置
    private Configuration configuration;
    // 事务
    private JdbcTransaction transaction;

    @Before
    public void before() throws SQLException {
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = factoryBuilder.build(ExecutorTest.class.getResourceAsStream("/mybatis-config.xml"));
        configuration = sqlSessionFactory.getConfiguration();
        // 数据库连接
        Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        transaction = new JdbcTransaction(connection);
    }

    // 简单执行器测试

    @Test
    public void simpleTest() throws SQLException {
        SimpleExecutor executor = new SimpleExecutor(configuration, transaction);
        // 动态SQL
        MappedStatement ms = configuration.getMappedStatement("com.wanda.UserMapper.count");
        // 第一次查询
        List<Object> list = executor.doQuery(ms, 10, RowBounds.DEFAULT, SimpleExecutor.NO_RESULT_HANDLER, ms.getBoundSql(10));
        // 第二次查询
        List<Object> list2 = executor.doQuery(ms, 10, RowBounds.DEFAULT, SimpleExecutor.NO_RESULT_HANDLER, ms.getBoundSql(10));
        System.out.println(list.get(0));
    }


    @Test
    @Ignore
    public void reuseTest() throws SQLException {
        ReuseExecutor executor = new ReuseExecutor(configuration, transaction);
        // 动态SQL
        MappedStatement ms = configuration.getMappedStatement("com.wanda.UserMapper.count");
        // 第一次查询
        List<Object> list = executor.doQuery(ms, 10, RowBounds.DEFAULT, ReuseExecutor.NO_RESULT_HANDLER, ms.getBoundSql(10));
        // 第二次查询
        List<Object> list2 = executor.doQuery(ms, 10, RowBounds.DEFAULT, ReuseExecutor.NO_RESULT_HANDLER, ms.getBoundSql(10));
        System.out.println(list.get(0));
    }


    @Test
    @Ignore
    public void batchTest() throws SQLException {
        BatchExecutor executor = new BatchExecutor(configuration, transaction);
        // 动态SQL
        MappedStatement ms = configuration.getMappedStatement("com.wanda.UserMapper.count");
        // 第一次查询
        List<Object> list = executor.doQuery(ms, 10, RowBounds.DEFAULT, BatchExecutor.NO_RESULT_HANDLER, ms.getBoundSql(10));
        // 第二次查询
        List<Object> list2 = executor.doQuery(ms, 10, RowBounds.DEFAULT, BatchExecutor.NO_RESULT_HANDLER, ms.getBoundSql(10));
        System.out.println(list.get(0));
    }
}
