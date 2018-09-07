package Dao;

import entity.New;

import java.util.List;

public interface NewDao {
    public List<New> queryNewById(String id);
    public List<String> queryNewId();
}
