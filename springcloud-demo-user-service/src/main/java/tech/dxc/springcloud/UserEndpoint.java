package tech.dxc.springcloud;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserEndpoint {

    protected Logger logger = Logger.getLogger(UserEndpoint.class);
    
    @Value("${server.port:2200}")
    private int serverPort = 2200;
    
    @RequestMapping(value="/{loginName}", method=RequestMethod.GET)
    public User detail(@PathVariable String loginName) {
        String memos = "I come from  " + this.serverPort;
        
        return new User(loginName, loginName, "/avater/default.png", memos);
    }
}
