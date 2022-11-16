/**
 * Copyright [2022] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.speedment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import rafael.alcocer.caldera.speedment.testdb.public_.users.Users;
import rafael.alcocer.caldera.speedment.testdb.public_.users.UsersManager;

@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {
    
    private final UsersManager usersManager;

    @Override
    public List<Users> getUsers() {
        return usersManager.stream().collect(Collectors.toList());
    }
}
