package com.zzb.ipfs.filestore.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date1 = new Date(l);
        String format = sdf.format(date1);
        Date parse = sdf.parse(format);
        System.out.println(format);
        System.out.println(date1);
        Date date = new Date();
        String format1 = sdf.format(date);
        Date parse1 = sdf.parse(format1);
        System.out.println(format1);
        boolean before = parse1.before(parse);
        boolean equals = format.equals(format1);
        System.out.println(equals);
        System.out.println(before);
    }

//    @RunWith(SpringJUnit4ClassRunner.class)
//    @ContextConfiguration(locations="classpath:spring/applicationContext-mongodb.xml")
//    public class MongoTest {
//
//        @Autowired
//        MongoTemplate mongoTemplate;
//        @Test
//        public void testInsert(){
//            Demo demo = new Demo();
//            demo.setField1("value1");
//            demo.setField2("value2");
//            mongoTemplate.insert(demo);
//        }
//
//        @Test
//        public void testRemove(){
//            Query query = new Query(Criteria.where("field1").is("value1"));
//            mongoTemplate.remove(query,Demo.class);
//        }
//
//        @Test
//        public void testUpdate(){
//            Query query = new Query();
//            query.addCriteria(Criteria.where("field1").is("value1"));
//            Update update = new Update();
//            update.set("field1","value2");
//            update.set("field2","value3");
//            mongoTemplate.updateMulti(query,update,Demo.class);
//        }
//
//        @Test
//        public void testFindAll(){
//            List<Demo> all = mongoTemplate.findAll(Demo.class);
//        }
//
//        @Test
//        public void testFindByQuery(){
//            Query query = new Query();
//            query.addCriteria(Criteria.where("key1").lt("value1"));
//            List<Demo> list = mongoTemplate.find(query,Demo.class);
//        }
//    }
}
