package xyy.java.note.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlsServiceTest {
    @Autowired
    private GirlsService girlsService;

    @Test
    public void getAge() throws Exception {
        girlsService.getAge(1);
    }

}