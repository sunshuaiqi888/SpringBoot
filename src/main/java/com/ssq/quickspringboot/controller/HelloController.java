package com.ssq.quickspringboot.controller;

import com.ssq.quickspringboot.bean.Athelete;
import com.ssq.quickspringboot.service.AtheleteService;
import com.ssq.quickspringboot.service.HelloService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// @RestController 这个类下的所有返回数据是json
@Controller
@RequestMapping("/hello")
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private AtheleteService service;
    @Autowired
    private HelloService se;

    @Value("${person.last-name}")
    private String name;


    //########################################### Swagger2 ##########################################//
    /**
     * springBoot整合swagger2
     * @param str
     * @param age
     * @return
     */
    @ApiOperation(value = "测试swagger2接口",notes = "测试swagger2接口的说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "str", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, dataType = "int")
    })
    @RequestMapping("/swagger")
    @ResponseBody
    public String helloWorld(String str,int age){
        if ("".equals(str)|| "".equals(age)){
            return "参数缺失";
        }
        return str+age+"\n作者："+name;
    }


    //########################################### 模板引擎 ##########################################//
    /**
     * springBoot整合FreeMarker
     * @param model
     * @return
     */
    @RequestMapping("/freemarker")
    public String helloWorld1(Model model){
        model.addAttribute("name","freemarker");
        System.out.println("打印日志：");
        log.info("输出内容了！");
        return "freemarker";
    }

    /**
     * springBoot整合thymeleaf
     * @param model
     * @return
     */
    @RequestMapping("/thymeleaf")
    public String helloWorld2(Model model){
        model.addAttribute("gcjp","国产精品");
        model.addAttribute("mtsw","美腿丝袜");
        model.addAttribute("zfyh","制服诱惑");
        model.addAttribute("zptp","自拍偷拍");
        model.addAttribute("yzwm","亚洲无码");
        model.addAttribute("omjq","欧美激情");
        log.info("看看都有啥好东西："+model.toString());
        return "thymeleaf";
    }


    //########################################### JPA ##########################################//
    /**
     * springBoot整合JPA
     * @param user
     * @return
     */
    @ApiOperation(value = "Jpa接口",notes = "测试新增运动员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ath_name", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "ath_birth", value = "生日", required = true, dataType = "String"),
            @ApiImplicitParam(name = "ath_sex", value = "性别", required = true, dataType = "String")
    })
    @RequestMapping("/JPASave")
    @ResponseBody
    public Athelete save(Athelete user) {
        return service.save(user);
    }

    /**
     * 根据姓名查询运动员信息
     * @param s_name
     * @return
     */
    @RequestMapping("/JPASelectByName")
    @ResponseBody
    public List<Athelete> selectByName(String s_name) {
        return service.findByName(s_name);
    }

    /**
     * 根据id查询运动员
     * @param athelete
     * @return
     */
    @RequestMapping("JPAQueryById")
    @ResponseBody
    public Athelete selectById(Athelete athelete){
        return service.findAthelete(athelete.getAth_id());
    }

    //########################################### Redis ##########################################//

    /**
     * springBoot整合redis
     *
     * 1.redis
     * 2.jedis
     * 3.spring-data-redis
     *
     *  必须有redis服务支持
     *
     *
     */
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @RequestMapping("/redis")
    @ResponseBody
    public Object bootRedis(){

        //RedisTemplate 方法有很多
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("学习资料网址",service);
        return ops.get("学习资料网址");
    }


    //########################################### Mybatis ##########################################//

    /**
     * springBoot整合MyBatis
     *
     * （注解用法可自行百度，不难，这里就不再赘述）
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/byId")
    public Athelete selectAthById(String id){

        String str = new StringBuffer("al").append("baba").toString().intern();
        System.out.println();
        return se.selectById(id);
    }




}
