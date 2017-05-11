package xyy.java.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyy
 * @version 1.0 2017/5/11.
 * @since 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/hello")
    public String say(){
        return girlProperties.getContent();
    }
}
