import org.jmock.Expectations;
import org.junit.runner.RunWith;

import static com.googlecode.instinct.expect.Expect.expect;

import com.Develomatic.AndroidDemo.Core.IMainActivity;
import com.Develomatic.AndroidDemo.Core.IUserRepository;
import com.Develomatic.AndroidDemo.Core.MainPresenter;
import com.Develomatic.AndroidDemo.Core.User;
import com.googlecode.instinct.integrate.junit4.InstinctRunner;
import com.googlecode.instinct.marker.annotate.BeforeSpecification;
import com.googlecode.instinct.marker.annotate.Mock;
import com.googlecode.instinct.marker.annotate.Specification;
import com.googlecode.instinct.marker.annotate.Subject;


@RunWith(InstinctRunner.class)
public class MainPresenterSpecs {
	@Subject private MainPresenter SUT;
	@Mock private IMainActivity activity;
	@Mock private IUserRepository userRepository;
	
	@BeforeSpecification
	public void before() {
		SUT = new MainPresenter(userRepository);
	}
	
	@Specification
	public void it_should_load_user_name_on_load_of_activity() {
		final User user = new User();
		user.setName("Joel Ross");
		
		expect.that(new Expectations() {
			{
				one(userRepository).get(); will(returnValue(user));
				one(activity).setUserNameTo("Joel Ross");
			}
		});
		
		SUT.InitializeWith(activity);
	}
}
