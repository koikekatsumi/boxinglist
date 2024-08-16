package com.example.boxinglist;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoxingListMapper {
    @Select("SELECT * FROM boxerdata")
    List<Boxer> findAll();

    @Select("SELECT * FROM boxerdata WHERE name LIKE CONCAT(#{prefix}, '%')")
    List<Boxer> findByNamesStartingWith(String startsWith);

    @Select("SELECT * FROM boxerdata WHERE id =#{id}")
    Optional<Boxer> findById(int id);

    @Select("SELECT * FROM boxerdata WHERE number_of_matches BETWEEN #{minMatches} AND #{maxMatches}")
    List<Boxer> findByNumberOfMatchesBetween(@Param("minMatches") int minMatches, @Param("maxMatches") int maxMatches);


}
