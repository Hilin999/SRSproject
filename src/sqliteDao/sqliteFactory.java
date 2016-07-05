package sqliteDao;

import dao.Idao;
import dao.Idaofactory;

public class sqliteFactory implements Idaofactory {
 

	@Override
	public Idao createIdao() {
		// TODO Auto-generated method stub
		 return new sqliteDao();
	}

}