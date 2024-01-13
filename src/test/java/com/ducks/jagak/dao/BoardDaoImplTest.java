package com.ducks.jagak.dao;

import com.ducks.jagak.domain.BoardDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoImplTest {
    @Autowired
    BoardDao boardDao;
    @Test
    public void selectTest() throws Exception {
        assertTrue(boardDao != null);
        BoardDto boardDto = boardDao.select(510);
        System.out.println("boardDto = " + boardDto);
    }
}