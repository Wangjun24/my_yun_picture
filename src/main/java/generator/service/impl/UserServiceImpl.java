package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.User;
import generator.service.UserService;
import generator.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wj
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-09-13 22:00:50
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




