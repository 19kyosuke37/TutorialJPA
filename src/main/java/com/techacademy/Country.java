package com.techacademy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter,setter,toString,hashCode,equalsの自動生成
@AllArgsConstructor //すべての引数を持つコンストラクタ
@NoArgsConstructor //引数なしコンストラクタ
@Entity//エンティティです宣言
@Table(name="country") //使用するデータベースのテーブル名
public class Country {
    @Id//主キーです宣言ｓ
    private String code;
    private String name;
    private int population;
}

//データベースから引っ張ってきたデータを格納している（１テーブル、１エンティティ）
//上で作られているフィールドが、データベースでいうところのカラムに値する
//このクラスから作られるインスタンスが、データベースでいうレコードになる

