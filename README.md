# SpringBoot, MySQL, JPA, Hibernate RestFul CRUD API

-------------------------------------------------------

### ๐ ๊ฐ์

+ SpringBoot, JPA, Hibernate๋ฅผ ํ์ฉํ CRUD API

-------------------------------------------------------

### ๐ ์ฃผ์ ์ด๋ธํ์ด์(Annotation)

* @Data
    * @Getter, @Setter, @RequriedArgsConstructor, @ToString, @EqualsAndHashCode์ ํ๊ป๋ฒ์ ์ค์  ํด์ฃผ๋ ์ด๋ธํ์ด์

* @AllArgsConstructor
    * ๋ชจ๋  ํ๋ ๊ฐ์ ํ๋ผ๋ฏธํฐ๋ก ๋ฐ๋ ์์ฑ์๋ฅผ ๋ง๋ค์ด์ฃผ๋ ์ด๋ธํ์ด์
* @NoArgsConstructor
    * ํ๋ผ๋ฏธํฐ๊ฐ ์๋ ๊ธฐ๋ณธ ์์ฑ์๋ฅผ ์์ฑํด์ฃผ๋ ์ด๋ธํ์ด์
* @Autowired
    * ํ์ํ ์์กด ๊ฐ์ฒด์ "ํ์(Type)"์ ํด๋นํ๋ ๋น(Bean)์ ์ฐพ์ ์ฃผ์ํด์ฃผ๋ ์ด๋ธํ์ด์
  > 1) ์์ฑ์
  >2) setter
  >3) ํ๋
    * ์์ 3๊ฐ์ง์ ๊ฒฝ์ฐ์๋ง ์ฌ์ฉ ๊ฐ๋ฅํ๋ค.
    * ๊ธฐ๋ณธ๊ฐ์ด true์ด๊ธฐ ๋๋ฌธ์ ์์กด์ฑ ์ฃผ์์ ํ  ๋์์ ์ฐพ์ง ๋ชปํ๋ค๋ฉด ๊ตฌ๋์ด ์คํจํ๋ค.
* @PathVariable
    * HTTP ์์ฒญ์ ๋ํด ๋งค์นญ๋๋ request parameter๊ฐ์ด ์๋์ผ๋ก ๋ค์ด์ค๋ ์ด๋ธํ์ด์
``` java
  @GetMapping("/productById/{id}")
    public Product findByProductId(@PathVariable int id) {
        return service.findByProductId(id);
    }
  ```
* @RequestParam
    * HTTP Get ์์ฒญ์ ๋ํด ๋งค์นญ๋๋ request parameter๊ฐ์ด ์๋์ผ๋ก ๋ค์ด์ค๋ ์ด๋ธํ์ด์
* @RequestBody
    * HTTP Post ์์ฒญ์ ๋ํด์๋ง ์ฒ๋ฆฌํ๋ ์ด๋ธํ์ด์
        * HTTP Post ์์ฒญ์ ๋ํด Request body์ ์๋ request message์์ ๊ฐ์ ์ป์ด์ ๋งค์นญํ๋ค.
``` java
  @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
  ```
๐ @RequestParam์ @PathVariable ๋์ ์ฌ์ฉ ์์ 
``` java
  @GetMapping("/createProduct/{id}/date")
    public Product createProduct(@PathVariable("id") int id,
                                 @RequestParam(value = "date", required = false) Date dateOrNull) {
    }
  ```
* ๊ตฌ๋ถ์{id}๋ @PathVariable("id")๋ก, ๋ค์ ์ด์ด๋ถ์ Parameter๋ @RequestParam("date")๋ก ๋ฐ์์จ๋ค.
------------------