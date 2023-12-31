package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="soldier")
public class Soldier {
		@Autowired
		@Qualifier("gun")
		private Weapon weapon;
		
		void perform()
		{
			weapon.attack();
		}
}
