import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from Pages.MyTripPage import MyTripPage


class Test_001_MakeMyTrip:
    baseURL = "https://www.makemytrip.com/"
    From = "HYD"
    to = "MMA"

    def test_homePageTitle(self):
        self.driver = webdriver.Chrome()
        self.driver.maximize_window()
        self.driver.get(self.baseURL)
        self.driver.implicitly_wait(10)

        self.mmt = MyTripPage(self.driver)
        element = WebDriverWait(self.driver, 10).until(
            EC.presence_of_element_located((By.XPATH, "//span[@class='commonModal__close']"))
        )
        element.click()

        # time.sleep(5)
        self.mmt.getFromCity(self.From)
        self.mmt.getToCity(self.to)
        self.mmt.getDepature()
        self.mmt.getReturn()
        self.mmt.getSearchBtn()
        self.mmt.getPopup()
        if self.mmt.getTitle() == "Flights from Hyderabad to Malmo, and back":
            assert True
        else:
            assert False

        self.driver.close()
