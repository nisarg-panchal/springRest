package io.github.nisarg1184.spring.rest.scratch;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class ObjectAsValueTest {
    @Getter
    @Setter
    @NoArgsConstructor
    static class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        public void chagePerson(Person person) {
            person.setName(name + " Change Added!");
        }
        public void pretendToChangePerson(Person person) {
            Person p = person;
            p = new Person("Pretending");
//            person = new Person();
//            person.setName("Pretend to Change "+ p.getName());
//            person.setName("Pretend to Change "+ person.getName());
        }

    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.chagePerson(p);
        System.out.printf("After calling changePerson: %s", p.getName());
        Person p1 = new Person();
        p1.setName("Someone");
        p1.pretendToChangePerson(p1);
        System.out.printf("\nAfter calling pretendToChangePerson: %s", p1.getName());

    }
}
