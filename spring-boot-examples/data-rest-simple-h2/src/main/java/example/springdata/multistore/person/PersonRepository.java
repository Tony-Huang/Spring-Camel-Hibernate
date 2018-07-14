/*
 * Copyright 2014-2018 the original author or authors.
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
package example.springdata.multistore.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * A repository to manage {@link Person} instances.
 *
 * @author Greg Turnquist
 * @author Oliver Gierke
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    public Person findByFirstName(@Param("name")  String firstName);
    public Person findByLastName(@Param("name") String lastName);
    public Person findByFirstNameAndLastName(@Param("firstName")String firstName, @Param("lastName") String lastName);


}
