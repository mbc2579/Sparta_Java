package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally 구문
        // try : 시도하다 catch : 잡다(붙잡다), finally : 마침내

        // 일단 try하고 예외가 발생하면 그걸 잡는다 (catch)
        // 그리고 정삭적으로 수행되는 예외가 발생하든 수행해야 하는 로직을 finally로 수행

        try {
            ourClass.thisMethodIsDangerous(); // 일단 실행
        } catch (OurBadException err) {
            System.out.println(err.getMessage());
        } finally {
            // 여기는 무조건 거침
            System.out.println("우리는 방금 예외를 handling 했다. 정상처리되든 예외사항이 발생하든 여기를 거침");
        }
    }
}
