package com.dbin.dao;

import com.dbin.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

//@Repository
@Component
public interface ScoreDao extends JpaRepository<Long, Score> {

//    int insertScore(Score score);
//
//    int deleteScore(Score score);
//
//    int updateScore(Score score);

//    List<Score> searchFromScore(String s);

//    Score selectScoreById(Score score);

//    List<Score> selectAllScores();

}
