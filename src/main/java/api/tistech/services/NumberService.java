package api.tistech.services;

import org.springframework.stereotype.Component;

@Component
public class NumberService {

	public Integer returnNumber3(int number1, int number2) {
		String number1String = String.valueOf(number1);
		char[] digits1 = number1String.toCharArray();
		int size1 = digits1.length;
		
		String number2String = String.valueOf(number2);
		char[] digits2 = number2String.toCharArray();
		int size2 = digits2.length;
		
		int size3 = 0;
		if (size1 > size2) {
			size3 = size1;
		} else {
			size3 = size2;
		}
		
		StringBuilder number3 = new StringBuilder();
		for (int i = 0; i < size3; i++) {
			if (i < size1) {
				number3.append(digits1[i]);				
			}
			if (i < size2) {
				number3.append(digits2[i]);
			}
		}
		
		return Integer.valueOf(number3.toString()) > 1000000 ? -1 : Integer.valueOf(number3.toString());
	}

}
