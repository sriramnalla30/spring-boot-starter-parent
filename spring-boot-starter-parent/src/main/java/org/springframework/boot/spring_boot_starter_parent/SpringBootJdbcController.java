package org.springframework.boot.spring_boot_starter_parent;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController  
public class SpringBootJdbcController {  

    @Autowired  
    JdbcTemplate jdbc;    

    @RequestMapping(value = "/insert", method = { RequestMethod.GET, RequestMethod.POST })
    public String index(){  

        jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");  

        return"data inserted Successfully";  

    }  

}  

