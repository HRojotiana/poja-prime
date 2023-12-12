package com.hei.rojotiana.service.event;

import com.hei.rojotiana.PojaGenerated;
import com.hei.rojotiana.endpoint.event.gen.UuidCreated;
import com.hei.rojotiana.repository.DummyUuidRepository;
import com.hei.rojotiana.repository.model.DummyUuid;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
