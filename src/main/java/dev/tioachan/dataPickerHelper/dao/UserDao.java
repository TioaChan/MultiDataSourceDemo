package dev.tioachan.dataPickerHelper.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import dev.tioachan.dataPickerHelper.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao extends BaseMapper<User> {

}
