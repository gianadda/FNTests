# -*- coding: utf-8 -*-
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
import time

success = True
wd = WebDriver()
wd.implicitly_wait(60)

def is_alert_present(wd):
    try:
        wd.switch_to_alert().text
        return True
    except:
        return False

try:
    wd.get("https://app.fieldnimble.com/")
    wd.find_element_by_id("input_0").click()
    wd.find_element_by_id("input_0").clear()
    wd.find_element_by_id("input_0").send_keys("gianadda@fieldnimble.com")
    wd.find_element_by_id("input_1").click()
    wd.find_element_by_id("input_1").clear()
    wd.find_element_by_id("input_1").send_keys("fieldnimbledemo")
    wd.find_element_by_css_selector("button.pull-right.ng-binding").click()
    wd.find_element_by_id("navigation-organization-name").click()
    wd.find_element_by_xpath("//div/home/div/navigation/div/ul/li[4]/div[2]/div[1]").click()
    wd.find_element_by_xpath("//div/home/div/navigation/div/ul/li[5]/div[2]/div[1]").click()
    wd.find_element_by_xpath("//div/home/div/navigation/div/ul/li[6]/div[2]/div[1]").click()
    wd.find_element_by_xpath("//div/home/div/navigation/div/ul/li[7]/div[2]/div[1]").click()
    wd.find_element_by_xpath("//div/home/div/navigation/div/ul/li[8]/div[2]/div[1]").click()
    wd.find_element_by_xpath("//div/home/div/navigation/div/ul/li[9]/div[2]/div[1]").click()
    if not ("Maintenance" in wd.find_element_by_tag_name("html").text):
        success = False
        print("verifyTextPresent failed")
    wd.find_element_by_id("page-header-alternative").click()
    ActionChains(wd).double_click(wd.find_element_by_id("page-header-alternative")).perform()
finally:
    wd.quit()
    if not success:
        raise Exception("Test failed.")
