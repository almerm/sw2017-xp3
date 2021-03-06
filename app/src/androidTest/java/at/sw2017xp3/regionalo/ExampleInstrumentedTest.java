package at.sw2017xp3.regionalo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.KeyEvent;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.core.IsNot.not;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("at.sw2017xp3.regionalo", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<HomeActivity> menuActivityTestRule =
            new ActivityTestRule<>(HomeActivity.class, true, true);

    @Test
    public void testMenuButtonsFirstScreen() {
        closeSoftKeyboard();
        onView(withId(R.id.buttonMeat)).perform(click());
        pressBack();
        onView(withId(R.id.buttonVegetables)).perform(click());
        pressBack();
        onView(withId(R.id.buttonFruit)).perform(click());
        pressBack();
        onView(withId(R.id.buttonMilk)).perform(click());
        pressBack();
        onView(withId(R.id.buttonCereals)).perform(click());
        pressBack();
        onView(withId(R.id.buttonOthers)).perform(click());
    }


    @Test
    public void testSearchGouda() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Gouda"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(16)).perform(scrollTo(), click());
    }


    @Test
    public void testSearchFleisch() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Spe"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(1)).perform(scrollTo(), click());
    }


    @Test
    public void testSearchObst() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Birne"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(8)).perform(scrollTo(), click());
    }


    @Test
    public void testSearchGemüse() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Tomaten"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(10)).perform(scrollTo(), click());
    }


    @Test
    public void testSearchSonstiges() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Honig"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(26)).perform(scrollTo(), click());
    }


    @Test
    public void testSearchGetreide() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Weizen"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(20)).perform(scrollTo(), click());
    }


    @Test
    public void testSearchFunction() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(click());
        onView(withId(R.id.searchViewHome)).perform(typeText("Hallo"), click());
    }


    @Test
    public void onClick() {
        closeSoftKeyboard();
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());
    }


    @Test
    public void testSearchSpeckDetail() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Speck"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(1)).perform(scrollTo(), click());
        //onView(withId(R.id.ButtonContact)).perform(scrollTo(), click());

    }


    @Test
    public void testSpeckDetail() {
        closeSoftKeyboard();
        onView(withId(1)).perform(scrollTo(), click());
        onView(withId(R.id.textViewProductName)).check(matches(withText("Speck")));

    }


    @Test
    public void testLikeButtonSearchBirneNotLikedAndLiked() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Birne"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(8)).perform(click());
        onView(withId(R.id.textViewProductName)).check(matches(withText("Birnen")));


        if (!onView(withId(R.id.buttonLike)).equals(isEnabled())) {
            onView(withId(R.id.buttonLike)).perform(click());
        } else {
            onView(withId(R.id.buttonLike)).check(matches((isEnabled())));
            onView(withId(R.id.buttonLike)).perform(click());
            onView(withId(R.id.buttonLike)).check(matches(not(isEnabled())));
        }

        pressBack();

        onView(withId(8)).perform(click());
        onView(withId(R.id.textViewProductName)).check(matches(withText("Birnen")));

        if (!onView(withId(R.id.buttonLike)).equals(isEnabled())) {
            onView(withId(R.id.buttonLike)).perform(click());
        } else {
            onView(withId(R.id.buttonLike)).check(matches((isEnabled())));
            onView(withId(R.id.buttonLike)).perform(click());
            onView(withId(R.id.buttonLike)).check(matches(not(isEnabled())));
        }

    }


    @Test
    public void testLikeButtonSpeckNotLikedAndLiked() {
        closeSoftKeyboard();

        onView(withId(1)).perform(click());
        onView(withId(R.id.textViewProductName)).check(matches(withText("Speck")));

        if (!onView(withId(R.id.buttonLike)).equals(isEnabled())) {
            onView(withId(R.id.buttonLike)).perform(click());
        } else {
            onView(withId(R.id.buttonLike)).check(matches((isEnabled())));
            onView(withId(R.id.buttonLike)).perform(click());
            onView(withId(R.id.buttonLike)).check(matches(not(isEnabled())));
        }

        pressBack();

        onView(withId(1)).perform(click());
        onView(withId(R.id.textViewProductName)).check(matches(withText("Speck")));

        if (!onView(withId(R.id.buttonLike)).equals(isEnabled())) {
            onView(withId(R.id.buttonLike)).perform(click());
        } else {
            onView(withId(R.id.buttonLike)).check(matches((isEnabled())));
            onView(withId(R.id.buttonLike)).perform(click());
            onView(withId(R.id.buttonLike)).check(matches(not(isEnabled())));
        }

    }


    @Test
    public void testSearchSpeckDetailLogin() {
        closeSoftKeyboard();
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Speck"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(1)).perform(scrollTo(), click());
        //onView(withId(R.id.ButtonContact)).perform(scrollTo(), click());

    }

    @Test
    public void checkBackButtonRegistry() {
        closeSoftKeyboard();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());
        onView(withId(R.id.buttonRegister)).perform(click());
        pressBack();
    }



    // Detail Page Menu Items

    @Test
    public void checkLoginDetailPageLogout() {
        closeSoftKeyboard();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());

        onView(withId(R.id.textViewEmail)).perform(typeText("test@gmx.at"));
        onView(withId(R.id.textViewPassword)).perform(typeText("test"));
        closeSoftKeyboard();
        onView(withId(R.id.buttonLogin)).perform(click());

        closeSoftKeyboard();
        pressBack();

        onView(withId(1)).perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Logout")).perform(click());
    }

    @Test
    public void checkLoginDetailPageProductAdd() {
        closeSoftKeyboard();
        onView(withId(1)).perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());

        onView(withId(R.id.textViewEmail)).perform(typeText("test@gmx.at"));
        onView(withId(R.id.textViewPassword)).perform(typeText("test"));
        closeSoftKeyboard();
        onView(withId(R.id.buttonLogin)).perform(click());

        closeSoftKeyboard();
        pressBack();

        onView(withId(1)).perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Produkt hinzufügen")).perform(click());

        closeSoftKeyboard();
        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Logout")).perform(click());
    }

    @Test
    public void checkDetailPageLogo() {
        closeSoftKeyboard();
        onView(withId(1)).perform(scrollTo(), click());
        onView(withId(R.id.logo)).perform(click());
    }

    @Test
    public void checkDetailPageProducerRegistration() {
        closeSoftKeyboard();
        onView(withId(1)).perform(scrollTo(), click());
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("als Produzent registrieren")).perform(click());
    }



    // Search Result Menu Items

    @Test
    public void checkLoginSearchResultLogout() {
        closeSoftKeyboard();

        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Weizen"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());

        onView(withId(R.id.textViewEmail)).perform(typeText("test@gmx.at"));
        onView(withId(R.id.textViewPassword)).perform(typeText("test"));
        closeSoftKeyboard();
        onView(withId(R.id.buttonLogin)).perform(click());

        closeSoftKeyboard();
        pressBack();
        pressBack();
        closeSoftKeyboard();


        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Logout")).perform(click());
    }

    @Test
    public void checkLoginSearchDetailProductAdd() {
        closeSoftKeyboard();

        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Weizen"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());

        onView(withId(R.id.textViewEmail)).perform(typeText("test@gmx.at"));
        onView(withId(R.id.textViewPassword)).perform(typeText("test"));
        closeSoftKeyboard();
        onView(withId(R.id.buttonLogin)).perform(click());

        closeSoftKeyboard();
        pressBack();
        pressBack();
        closeSoftKeyboard();


        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Produkt hinzufügen")).perform(click());

        closeSoftKeyboard();
        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Logout")).perform(click());
    }

    @Test
    public void checkSearchResultLogo() {
        closeSoftKeyboard();

        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Weizen"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));

        onView(withId(R.id.logo)).perform(click());
    }

    @Test
    public void checkSearchDetailProducerRegistration() {
        closeSoftKeyboard();

        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));
        onView(withId(R.id.searchViewHome)).perform(typeText("Weizen"));
        onView(withId(R.id.searchViewHome)).perform(pressKey(KeyEvent.KEYCODE_ENTER));

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("als Produzent registrieren")).perform(click());
    }



    // Home Activity Menu Items
    
    @Test
    public void checkLoginHomeLogout() {
        closeSoftKeyboard();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());

        onView(withId(R.id.textViewEmail)).perform(typeText("test@gmx.at"));
        onView(withId(R.id.textViewPassword)).perform(typeText("test"));
        closeSoftKeyboard();
        onView(withId(R.id.buttonLogin)).perform(click());

        closeSoftKeyboard();
        pressBack();
        closeSoftKeyboard();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Logout")).perform(click());
    }

    @Test
    public void checkLoginHomeProductAdd() {
        closeSoftKeyboard();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Login")).perform(click());

        onView(withId(R.id.textViewEmail)).perform(typeText("test@gmx.at"));
        onView(withId(R.id.textViewPassword)).perform(typeText("test"));
        closeSoftKeyboard();
        onView(withId(R.id.buttonLogin)).perform(click());

        closeSoftKeyboard();
        pressBack();
        closeSoftKeyboard();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Produkt hinzufügen")).perform(click());

        closeSoftKeyboard();
        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Logout")).perform(click());
    }

    @Test
    public void checkHomeLogo() {
        closeSoftKeyboard();
        onView(withId(R.id.logo)).perform(click());
    }

    @Test
    public void checkHomeProducerRegistration() {
        closeSoftKeyboard();
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("als Produzent registrieren")).perform(click());
    }


}