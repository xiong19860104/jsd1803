package dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import entity.Trip;

@Repository("tripDAO")
public class TripDAOImpl implements TripDAO {
	@Autowired
	@Qualifier("sst")
	private SqlSessionTemplate sst;

	public List<Trip> find() {

		return sst.selectList("dao.TripDAO.myPage");
	}

	public List<Trip> findByPage(int start, int end) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("end", end);
		List<Trip> list = sst.selectList("dao.TripDAO.findByPage", map);
		return list;
	}

}
