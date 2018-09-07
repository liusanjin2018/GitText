package DaoImpl;

import Dao.NewDao;
import Utils.DBUtils;
import entity.New;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewDaoImpl implements NewDao {
    @Override
    public List<New> queryNewById(String id) {
        List<New> list = new ArrayList<New>();
        New n = new New();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn= DBUtils.getConn();
            String sql = "select n_title,send_date from News where id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                n.setSendtime(rs.getDate("send_date"));
                n.setTitle(rs.getString("n_title"));
                list.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtils.close(rs,pstmt,conn);
        }
        return list;
    }


    @Override
    public List<String> queryNewId() {
        List<String> list = new ArrayList<String>();
        String n=null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn= DBUtils.getConn();
            String sql = "select n_id from News where 1=1";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
               n = rs.getString("n_id");

                list.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtils.close(rs,pstmt,conn);
        }
        return list;
    }
}
