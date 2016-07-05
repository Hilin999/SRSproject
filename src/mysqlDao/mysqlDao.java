package mysqlDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import dao.Idao;
import model.Section;
import util.DbUtil;

public class mysqlDao implements Idao {

/*
	@Override
	public void addCourse(String serialNumber, String price, ) throws Exception {
		// TODO Auto-generated method stub
		Guitar guitar=new Guitar(serialNumber, price, spec);
		String sql = "insert into inventory (price,serialNumber) values (?,?) ";
		Connection conn=DbUtil.getConnection("mysql");
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, guitar.getPrice());
		ptmt.setString(2, guitar.getSerialNumber());
		ptmt.close();     
	}

	@Override
	public List<Guitar> searchGuitar(String serialNumber) throws Exception {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			String sql = "select * from inventory where 1=1 ";
			Connection conn=DbUtil.getConnection("mysql");
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			Inventory inventory=new Inventory();
			while (rs.next()) {
					inventory.addGuitar(rs.getString("serialNumber"),rs.getString("price"), 
						new GuitarSpec(rs.getString("builder"), rs.getString("type"), rs.getString("numStrings"), 
					                     rs.getString("backwood"), rs.getString("topwood")));
						
						}
			ptmt.close();
			return null;
		}
	
	@Override
	public void delGuitar(String serialNumber) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from inventory where serialNumber=? ";
		Connection conn = null;
		try {
			conn = DbUtil.getConnection("mysql");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, serialNumber);	 
		ptmt.close();
	}
*/
	@Override
	public void addSection(String CourNo, String price) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Section> searchSection(String sectionNo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delSection(String CourseNo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
