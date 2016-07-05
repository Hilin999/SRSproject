package mysqlDao;

import dao.Idao;
import dao.Idaofactory;

public class mysqlFactory implements Idaofactory {
 

	@Override
	public Idao createIdao() {
		// TODO Auto-generated method stub
		 return new mysqlDao();
	}

}