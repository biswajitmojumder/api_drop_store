package br.com.drop.service.impl;

import br.com.drop.model.dto.UserDTO;
import br.com.drop.model.entities.User;

public interface UserService {

    User save(UserDTO userDTO);
}
