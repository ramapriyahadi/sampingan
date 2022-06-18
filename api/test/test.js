
const expect = require('chai').expect;
const request = require('supertest');


describe('sampinganTest', function () {
  describe('test response api', function () {
    it('should return 200 and id 2', async () => {
      await request("https://reqres.in").get("/api/users/2").expect(200).then((res) => {expect(res.body.data.id).to.eq(2)});
    });
  });
});