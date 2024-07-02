package space.bumee.SBHiber.entities;

import java.util.EnumSet;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.hibernate.generator.EventTypeSets;

public class StudIdGenerator implements BeforeExecutionGenerator  {

  private static long sn = 0;
  @Override
  public EnumSet<EventType> getEventTypes() {
    // TODO Auto-generated method stub
    return EventTypeSets.INSERT_ONLY;
  }

  @Override
  public Object generate(SharedSessionContractImplementor session, Object owner,
      Object currentValue, EventType eventType) {
    sn += 3;
    return sn;
  }

}
