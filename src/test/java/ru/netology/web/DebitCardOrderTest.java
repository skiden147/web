package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class DebitCardOrderTest {
    @Test
    void shouldTest() throws InterruptedException {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Иннокентий");
        $("[data-test-id=phone] input").setValue("+79265903845");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
