/*1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        5. Задание с перечислениями. Задание прикреплено в материалах
        6. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
        С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заданному текущему дню.

            Возвращает кол-во оставшихся рабочих часов до конца недели по заданному текущему дню.
            Считается, что текущий день ещё не начался, и рабочие часы за него должны учитываться.
            Если заданный день выходной то вывести "Сегодня выходной"

 public class DayOfWeekMain {

 public static void main(String[] args) {
 System.out.println(getWorkingHours(DayOfWeek.MONDAY));
 }
*/
package Lesson1.Interface;

import Lesson1.Interface.barrier.Treadmill;
import Lesson1.Interface.barrier.Wall;
import Lesson1.Interface.player.Cat;
import Lesson1.Interface.player.Human;
import Lesson1.Interface.player.Robot;

public class HomeWork1 {
    public static void main(String[] args) {
        Player[] player = {new Cat(10, 5),new Cat(19,3), new Human(20, 4), new Robot(30, 6),new Robot(40, 5)};
        Barrier[] barrier = {new Treadmill(19), new Wall(4), new Wall(5)};
        testRJ(player, barrier);

    }

    private static void testRJ(Player[] player, Barrier[] barrier) {
        for (int i=0;i<player.length;i++) {
            for (Barrier br : barrier) {
                if(player[i].run(br.getLength())) {System.out.println(player[i].getName() +player[i].getIndex()+ " run");}else{System.out.println(player[i].getName() +player[i].getIndex()+ " not run");break;}
                if(player[i].jump(br.getLength())) {System.out.println(player[i].getName()+player[i].getIndex() + " jump");}else{System.out.println(player[i].getName() +player[i].getIndex()+ " not jump");break;}
                
            }
        }
    }


}