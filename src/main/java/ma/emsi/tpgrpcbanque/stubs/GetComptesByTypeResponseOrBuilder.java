// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.emsi.tpgrpcbanque.stubs;

public interface GetComptesByTypeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetComptesByTypeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  java.util.List<ma.emsi.tpgrpcbanque.stubs.Compte> 
      getComptesList();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  ma.emsi.tpgrpcbanque.stubs.Compte getComptes(int index);
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  int getComptesCount();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  java.util.List<? extends ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder> 
      getComptesOrBuilderList();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder getComptesOrBuilder(
      int index);
}
