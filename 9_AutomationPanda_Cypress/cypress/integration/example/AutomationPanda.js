require('cypress-xpath')
describe('AutomationPanda',() => {
    beforeEach(()=>{
        cy.log("*******Launching the Browser*******")
        cy.visit( "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/")
        cy.xpath("//a[normalize-space()='Speaking']").click()
        
    })
    it('test1', () => {
        cy.fixture('AutomationPanda').then( (data)=>{
            cy.xpath("//h1[normalize-space()='Speaking']").invoke('text').then((text) => {
                expect(text).to.eq(data.title1)
            })
        })
    } )

    it('test2', () => {
        cy.xpath("//h2[normalize-space()='Keynote Addresses']").scrollIntoView();
        cy.wait(1000);
        cy.fixture('AutomationPanda').then( (data)=>{
            cy.xpath("//h2[normalize-space()='Keynote Addresses']").invoke('text').then((text) => {
                expect(text).to.eq(data.title2)
            })
        })
    } )

    afterEach(()=>{
        cy.log("******close Browser*******")
    })
} )