describe('Selenium Test Case', function() {
  it('should execute test case without errors', function() {
    var text, value, bool, source, url, title;
    var TestVars = {};
    browser.get("https://app.fieldnimble.com/");
    element(by.id("input_0")).sendKeys("gianadda@fieldnimble.com");
    element(by.id("input_1")).sendKeys("fieldnimbledemo");
    element(by.css("button.pull-right.ng-binding")).click();
    element(by.id("navigation-organization-name")).click();
    element(by.xpath("//div/home/div/navigation/div/ul/li[4]/div[2]/div[1]")).click();
    element(by.xpath("//div/home/div/navigation/div/ul/li[5]/div[2]/div[1]")).click();
    element(by.xpath("//div/home/div/navigation/div/ul/li[6]/div[2]/div[1]")).click();
    element(by.xpath("//div/home/div/navigation/div/ul/li[7]/div[2]/div[1]")).click();
    element(by.xpath("//div/home/div/navigation/div/ul/li[8]/div[2]/div[1]")).click();
    element(by.xpath("//div/home/div/navigation/div/ul/li[9]/div[2]/div[1]")).click();
    text = element(by.tagName('html')).getText();
    expect(text).toContain("" + "Maintenance");
    element(by.id("page-header-alternative")).click();
    element(by.id("page-header-alternative")).click();
    element(by.id("page-header-alternative")).click();
  });
});
