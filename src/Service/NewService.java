package Service;

import entity.New;

import java.util.List;

public interface NewService {
    public List<New> queryNewById(String id);
    public List<String> queryNewId();
}
