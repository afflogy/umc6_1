package umc.study.service.MemberService;

import umc.study.domain.Member;
import umc.study.web.dto.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDTO request); // MemberRestController때문에 생성
}
