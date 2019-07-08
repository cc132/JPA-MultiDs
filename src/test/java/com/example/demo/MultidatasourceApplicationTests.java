package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mutildatasource.domain.p.HserRepository;
import com.example.demo.mutildatasource.domain.p.User;
import com.example.demo.mutildatasource.domain.s.Message;
import com.example.demo.mutildatasource.domain.s.MessageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultidatasourceApplicationTests {

	
  @Autowired
  private HserRepository userRepository;
  @Autowired
  private MessageRepository messageRepository;
  
  @Test
	public void testMultiDataSource() throws Exception {
  	 userRepository.save(new User("aaa", 10));
       userRepository.save(new User("bbb", 20));
       userRepository.save(new User("ccc", 30));
       userRepository.save(new User("ddd", 40));
       userRepository.save(new User("eee", 50));

       Assert.assertEquals(10, userRepository.findAll().size());

       messageRepository.save(new Message("o1", "aaaaaaaaaa"));
       messageRepository.save(new Message("o2", "bbbbbbbbbb"));
       messageRepository.save(new Message("o3", "cccccccccc"));

       Assert.assertEquals(6, messageRepository.findAll().size());
	}
}
