package ee.eritirumal.ehipster.service;

import java.util.List;

public interface BlockService {
    List<String> getList();
    void addBlock(String value);
    void popBlock();
}
