package br.com.erudio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.Math.SimpleMath;
import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	  public Double sum(@PathVariable(value = "numberOne") String numberOne,
			  @PathVariable(value = "numberTwo") String numberTwo)throws Exception{ 
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
       return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}     
 
   	@GetMapping(value = "/sub/{numberOne}/{numberTwo}")
   	  public Double sub(@PathVariable(value = "numberOne") String numberOne,
   			  @PathVariable(value = "numberTwo") String numberTwo)throws Exception{ 
   		
   		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
   			throw new UnsupportedMathOperationException("Please set a numeric value");
   		}
          return math.sub(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
   	
   	@GetMapping(value = "/mult/{numberOne}/{numberTwo}")
   	  public Double mult(@PathVariable(value = "numberOne") String numberOne,
   			  @PathVariable(value = "numberTwo") String numberTwo)throws Exception{ 
   		
   		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
   			throw new UnsupportedMathOperationException("Please set a numeric value");
   		}
          return math.mult(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
   	
   	@GetMapping(value = "/div/{numberOne}/{numberTwo}")
   	  public Double div(@PathVariable(value = "numberOne") String numberOne,
   			  @PathVariable(value = "numberTwo") String numberTwo)throws Exception{ 
   		
   		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
   			throw new UnsupportedMathOperationException("Please set a numeric value");
   		}
          return math.div(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
   	
   	@GetMapping(value = "/media/{numberOne}/{numberTwo}")
   	  public Double media(@PathVariable(value = "numberOne") String numberOne,
   			  @PathVariable(value = "numberTwo") String numberTwo)throws Exception{ 
   		
   		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
   			throw new UnsupportedMathOperationException("Please set a numeric value");
   		}
          return math.media(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo)) / 2;
    }
   	
   	@GetMapping(value = "/raiz/{numberOne}")
   	  public Double raiz(@PathVariable(value = "numberOne") String numberOne)throws Exception{ 
   		
   		if(!NumberConverter.isNumeric(numberOne)) {
   			throw new UnsupportedMathOperationException("Please set a numeric value");
   		}
          return math.raiz(Math.sqrt(NumberConverter.convertToDouble(numberOne)));
    }

	
}
