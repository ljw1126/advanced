package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadLocalService {
    private ThreadLocal<String> nameString = new ThreadLocal<>();

    public String logic(String name) {
        log.info("저장 name = {} -> nameString = {}", name, nameString.get());
        nameString.set(name);
        sleep(1000);
        log.info("조회 nameStore={}", nameString.get());
        return nameString.get();
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
