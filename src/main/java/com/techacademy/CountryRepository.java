package com.techacademy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
                                           //JpaRepositoryの<>（ジェネリクス）中の意味は
                                           //<リポジトリで扱うエンティティクラス,エンティティクラスの主キーの方の指定>
}
//データストアにアクセスして、データ操作をする手段の提供をするインターフェイス。　多分おまじないに近い。？

//１エンティティ、１リポジトリ

/*継承しているJpaRepositoryに、様々なメソッドが提供されていて、エンティティごとに作るこのようなリポジトリはそれらを引き継いでいる。
 * 具体的には以下のようなもの
 *・findAll(): 全件検索
 *・findById(): 1件検索（主キーによる検索）
 *・save\(): 作成、更新
 *・deleteById(): 1件削除（主キーによる削除）*/

//serviceクラスではCountryRepositoryクラスのインスタンスを作って、以上のメソッド達を使い分けている

//@Repositoryアノテーションが本来必要だが、JpaRepositoryインターフェイスを継承しているといらない


