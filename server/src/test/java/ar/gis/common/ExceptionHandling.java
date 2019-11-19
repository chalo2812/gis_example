package ar.gis.common;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Profile("test")
@ControllerAdvice
public final class ExceptionHandling {

}
