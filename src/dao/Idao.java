package dao;

import java.sql.SQLException;
import java.util.List;

import model.Section;



public interface Idao {
	public void addSection(String CourNo, String price
           ) throws Exception;
	public List<Section> searchSection(String sectionNo) throws SQLException, Exception;
	public void delSection(String CourseNo) throws SQLException;
}
