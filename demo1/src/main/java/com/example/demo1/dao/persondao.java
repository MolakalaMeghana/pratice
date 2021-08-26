
package com.example.demo1.dao;
import com.example.demo1.model.person;
import java.util.*;
public interface persondao {
    int insertPerson(person person);
    List<person> selectAllPerson();
}
