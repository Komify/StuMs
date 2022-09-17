package com.jkh.j2eedemo;

import com.jkh.j2eedemo.dao.GxxsTest;
import com.jkh.j2eedemo.entity.Gxxs;
import com.jkh.j2eedemo.util.dateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
public class springJDBCTest {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @Test
//    void testCreate(){
//        int update = jdbcTemplate.update("create table blance(id int primary key auto_increment," +
//                "name varchar(25),balance decimal(18,2))");
//        System.out.println(update);
//    }
//    @Test
//    void testAdd(){
//        int update = jdbcTemplate.update("insert into blance(id,name,balance) " +
//                "values (1,'吉康辉',8000000) ");
//        System.out.println("新增了"+update+"条数据");
//    }
//    @Test
//    void testUpdat(){
//        int update = jdbcTemplate.update("update blance set balance ='9000000' " +
//                "where name='吉康辉'");
//        System.out.println("修改了"+update+"条数据");
//    }
//    @Test
//    void testDel(){
//        int update = jdbcTemplate.update("delete from blance where id =1");
//        System.out.println("删除了"+update+"条数据");
//    }
   @Autowired
    private GxxsTest gxxsMapperdao;
   @Test
    public void dobatchsaveteststu(){
       for (int i = 0; i <100000 ; i++) {
           Gxxs gxxs = new Gxxs();
           gxxs.setXh("200"+i);
           gxxs.setXmpy("xingmingpingyin"+i);
           gxxs.setCym("cengyongming"+i);
           if(i%2==0){
           gxxs.setXb("男");
               System.out.println("男");

           }
           else{
               gxxs.setXb("女");
               System.out.println("女");
           }
           Random random = new Random();
           gxxs.setCsrq(dateUtil.GetDate("19"+
                   (50+random.nextInt(50)) +"-"
                   +(random.nextInt(12)+1)+ "-"+(random.nextInt(30)+1)));
          int  r=random.nextInt(100);
           if(r>10&&r<20){
               gxxs.setCsd("江西");
               gxxs.setJg("南昌");

           }else if(r>200&&r<30){
               gxxs.setCsd("上海");
               gxxs.setJg("上海");

           }else if(r>30&&r<40){
               gxxs.setCsd("辽宁");           gxxs.setJg("沈阳");

           }else if(r>40&&r<50){
               gxxs.setCsd("江苏");           gxxs.setJg("南京");

           }else if(r>50&&r<60){
               gxxs.setCsd("四川");           gxxs.setJg("成都");

           }else if(r>60&&r<70){
               gxxs.setCsd("浙江");           gxxs.setJg("杭州");

           }else if(r>80&&r<90){
               gxxs.setCsd("安徽");           gxxs.setJg("合肥");

           }else if(r>90&&r<100){
               gxxs.setCsd("山西");           gxxs.setJg("太原");

           }else{
               gxxs.setCsd("北京");           gxxs.setJg("北京");

           }

           gxxs.setMz("汉族");
           gxxs.setGj("中国");
           gxxs.setSfzjlx("身份证");
           StringBuilder rs = new StringBuilder();
           for (int j = 0; j < 18; j++) {
               rs.append(random.nextInt(10));
           }
           gxxs.setSfzjh(rs.toString());
           if(i%2==0){
               gxxs.setHyzk("已婚");}else{
               gxxs.setHyzk("未婚");
           }
           if(i%2==0){
               gxxs.setZzmm("共青团员");}else{
               gxxs.setZzmm("群众");
           }
           gxxs.setJkzk("健康");
           gxxs.setXyzj("无");
           if(i%2==0){
               gxxs.setXx("O");}else{
               gxxs.setXx("A");
           }
           gxxs.setZjyxq(dateUtil.GetDate("2030-10-08"));
           if(r>10&&r<20){
               gxxs.setSsbm("880001");
               gxxs.setJnm("880001");
           }else if(r>200&&r<30){
               gxxs.setSsbm("880102");
               gxxs.setJnm("880102");


           }else if(r>30&&r<40){
               gxxs.setSsbm("880102");
               gxxs.setJnm("880102");


           }else if(r>40&&r<50){
               gxxs.setSsbm("880105");
               gxxs.setJnm("880105");


           }else if(r>50&&r<60){
               gxxs.setSsbm("880204");
               gxxs.setJnm("880204");

           }else if(r>60&&r<70){
               gxxs.setSsbm("880103");
               gxxs.setJnm("880103");


           }else if(r>80&&r<90){
               gxxs.setSsbm("880103");
               gxxs.setJnm("880103");


           }else if(r>90&&r<100){
               gxxs.setSsbm("880405");
               gxxs.setJnm("880405");


           }else{
               gxxs.setSsbm("880406");
               gxxs.setJnm("880406");


           }

           if(r>10&&r<20){
               gxxs.setSsbj("0110");
           }else if(r>20&&r<30){
               gxxs.setSsbj("0102");


           }else if(r>30&&r<40){
               gxxs.setSsbj("0102");

           }else if(r>40&&r<50){
               gxxs.setSsbj("0104");

           }else if(r>50&&r<60){
               gxxs.setSsbj("0105");

           }else if(r>60&&r<70){
               gxxs.setSsbj("0106");

           }else if(r>80&&r<90){
               gxxs.setSsbj("0110");

           }else if(r>90&&r<100){
               gxxs.setSsbj("0104");
           }else{
               gxxs.setSsbj("0109");

           }
           gxxs.setYwxm("ywxm"+i);
           gxxs.setDwh("jx"+random.nextInt(10));
           gxxsMapperdao.insert(gxxs);
       }
   }

}
