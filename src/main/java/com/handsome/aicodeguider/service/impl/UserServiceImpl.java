package com.handsome.aicodeguider.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.handsome.aicodeguider.genresult.entity.User;
import com.handsome.aicodeguider.mapper.UserMapper;
import com.handsome.aicodeguider.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author <a href="https://github.com/zhijiezhangggggg/ai-code-guider">handsomejack</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}
