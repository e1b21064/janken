package oit.is.z1924.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1924.kaizi.janken.model.Entry;

/**
 * Sample21Controller
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
@Controller
public class JankenController {

  /**
   * sample21というGETリクエストがあったら sample21()を呼び出し，sample21.htmlを返す
   */

  @Autowired
  private Entry room;

  @GetMapping("/index")
  public String index() {
    return "index.html";
  }

  /**
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */

  @GetMapping("/janken")
  public String janken() {
    return "janken.html";
  }

  /**
   * @param user
   * @return
   */
  @PostMapping("/janken")
  public String janken(@RequestParam String user) {
    return "janken.html";
  }

  /**
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */

  @GetMapping("step8")
  public String sample38(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);

    return "janken.html";
  }

}
