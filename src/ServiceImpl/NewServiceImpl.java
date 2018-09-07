package ServiceImpl;

import Dao.NewDao;
import DaoImpl.NewDaoImpl;
import Service.NewService;
import entity.New;

import java.util.List;

public class NewServiceImpl implements NewService {
    NewDao newDao = new NewDaoImpl();
    @Override
    public List<New> queryNewById(String id) {
       return newDao.queryNewById(id);
    }

    @Override
    public List<String> queryNewId() {
        return newDao.queryNewId();
    }
}
