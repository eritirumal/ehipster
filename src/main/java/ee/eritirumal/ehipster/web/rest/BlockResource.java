package ee.eritirumal.ehipster.web.rest;

import ee.eritirumal.ehipster.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/block")
public class BlockResource {

    @Autowired
    BlockService blockService;

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getBlocks() {
       return blockService.getList();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBlock(@RequestBody String value) {
        blockService.addBlock(value);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void popBlock() {
        blockService.popBlock();
    }
}
