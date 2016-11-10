package ee.eritirumal.ehipster.service.impl;

import ee.eritirumal.ehipster.repository.AuthorityRepository;
import ee.eritirumal.ehipster.service.BlockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class BlockServiceImpl implements BlockService {
    private final Logger log = LoggerFactory.getLogger(BlockServiceImpl.class);

    @Override
    public List<String> getList() {
        SecurityContextHolder.getContext().getAuthentication();
        return Collections.emptyList();
    }

    @Override
    public void addBlock(String value) {

    }

    @Override
    public void popBlock() {

    }
}
